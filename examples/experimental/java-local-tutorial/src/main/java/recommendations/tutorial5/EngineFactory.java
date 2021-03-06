package io.prediction.examples.java.recommendations.tutorial5;

import io.prediction.examples.java.recommendations.tutorial3.DataSource;
import io.prediction.examples.java.recommendations.tutorial1.TrainingData;
import io.prediction.examples.java.recommendations.tutorial1.Query;

import io.prediction.controller.java.IJavaEngineFactory;
import io.prediction.controller.java.JavaSimpleEngine;
import io.prediction.controller.java.JavaSimpleEngineBuilder;

public class EngineFactory implements IJavaEngineFactory {
  public JavaSimpleEngine<TrainingData, Object, Query, Float, Float> apply() {
    return new JavaSimpleEngineBuilder<
      TrainingData, Object, Query, Float, Float> ()
      .dataSourceClass(DataSource.class)
      .preparatorClass() // Use default Preparator
      .addAlgorithmClass("MyMahoutRecommendationAlgo", MahoutAlgorithm.class)
      .servingClass() // Use default Serving
      .build();
  }
}
