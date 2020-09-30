package org.jefrajames.merchant.entity;

import javax.persistence.Embeddable;
import org.eclipse.microprofile.graphql.Description;

@Embeddable
@Description("Postal address")
public class Address {
    
    public String number;
    
    public String street;
    
    public String city;
    
    public String country;
    
}
