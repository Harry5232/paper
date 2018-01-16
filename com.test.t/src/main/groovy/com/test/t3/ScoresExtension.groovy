package com.test.t3
import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension
import org.spockframework.runtime.model.SpecInfo
import org.spockframework.runtime.model.FeatureInfo
import org.spockframework.runtime.model.MethodInfo


class ScoresExtension extends AbstractAnnotationDrivenExtension<Scores> {
  def ScoresSpec = false
  def ScoresFeatures = []
  def sumScores = 0

  void visitSpecAnnotation(Scores annotation, SpecInfo spec) {
    ScoresSpec = true
  }

  void visitFeatureAnnotation(Scores annotation, FeatureInfo feature) {
	  //sumScores += annotation.points()
//	  feature.
  }

  void visitSpec(SpecInfo spec) {
    spec.addListener(new ScoresRunListener(ScoresSpec, ScoresFeatures))
  }
}