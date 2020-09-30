package org.jefrajames.score.entity;

import org.eclipse.microprofile.graphql.Description;

@Description("Payment scoring items")
public enum ScoreType {
    Revenue,Acceptance,Fraud,Churn
}
