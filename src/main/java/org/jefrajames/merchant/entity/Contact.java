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
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.eclipse.microprofile.graphql.Description;

/**
 *
 * @author jefrajames
 */
@Entity
@Description("Merchant contact")
public class Contact extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonbTransient
    public Integer id;

    @Description("Contact name")
    public String name;
    
    @Description("Postal adresses")
    public Address address;

    @Description("List of phones")
    @ElementCollection(fetch = FetchType.LAZY, targetClass = String.class)
    public List<String> phoneNumbers;

    @Description("List of email adresses")
    @ElementCollection(fetch = FetchType.LAZY, targetClass = String.class)
    public List<String> emailAddresses;

}
