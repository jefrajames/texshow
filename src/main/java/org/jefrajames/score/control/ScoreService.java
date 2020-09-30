package org.jefrajames.score.control;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import org.jefrajames.score.entity.Score;

@ApplicationScoped
public class ScoreService {
    
    private final Map<String,List<Score>> scoreDatabase = new HashMap<>();
    
    public List<Score> getScores(String idScore){
        return scoreDatabase.get(idScore);
    }
    
    @PostConstruct
    void init(){
        try(InputStream jsonStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("META-INF/score.json")){
            if(jsonStream!=null){
                List<List<Score>> loaded = JSONB.fromJson(jsonStream, new ArrayList<List<Score>>(){}.getClass().getGenericSuperclass());
                for(List<Score> s:loaded){
                    scoreDatabase.put(ids.pop(), s);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private static final Jsonb JSONB = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
    
    private static Stack<String> ids = new Stack<>();
    static{
        ids.addAll(Arrays.asList(new String[]{"ms-1","ms-2","ms-3","ms-4","ms-5","ms-6","ms-7","ms-8","ms-9","ms-10"}));
    }
}