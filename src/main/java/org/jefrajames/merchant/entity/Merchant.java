/*
 * Copyright 2020 jefrajames.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jefrajames.merchant.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.ToString;
import org.eclipse.microprofile.graphql.Description;

/**
 *
 * @author jefrajames
 */
@Entity
@Description("Merchant acquiring data")
@ToString(includeFieldNames = true)
@RegisterForReflection
public class Merchant extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @JsonbDateFormat("dd/MM/yyyy")
    @Description("Date of contract")
    public LocalDate joinDate;

    @Description("Brand name")
    public String brandName;
    
    @Description("Twitter handle")
    public String twitterHandle;
    
    @Description("Is scoring service enabled?")
    public Boolean scoreEnabled;

    @Description("Score id")
    public String scoreId;

    @Description("Merchant web site")
    public String webSite;
    
    @Description("Merchant status")
    @Enumerated(EnumType.STRING)
    public Status status;
     
    @Description("Merchant activity")
    @Enumerated(EnumType.STRING)
    public Activity activity;

    @Description("Contracted level of service")
    @Enumerated(EnumType.STRING)
    public ServiceLevel serviceLevel;
    
    @Description("Merchant activity level")
    @Enumerated(EnumType.STRING)
    public ActivityLevel activityLevel;
    
    @Description("In store payments accepted")
    public Boolean inStore;
    
    @Description("On line payments accepted")
    public Boolean onLine;
    
    @Description("Mobile payments accepted")
    public Boolean mobile;
    
    @Description("List of contacts")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Contact.class)
    public List<Contact> contacts;

    
    @Description("List of accepted card schemes")
    @ElementCollection(targetClass=CardScheme.class)
    @Enumerated(EnumType.STRING)
    public List<CardScheme> cardSchemes;
    
  
}
