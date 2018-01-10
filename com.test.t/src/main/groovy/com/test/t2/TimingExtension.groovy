package com.test.t2
import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension
import org.spockframework.runtime.model.SpecInfo
import org.spockframework.runtime.model.FeatureInfo
import org.spockframework.runtime.model.MethodInfo


class TimingExtension extends AbstractAnnotationDrivenExtension<Time> {
  def timeSpec = false
  def timedFeatures = []

  void visitSpecAnnotation(Time annotation, SpecInfo spec) {
    timeSpec = true
  }

  void visitFeatureAnnotation(Time annotation, FeatureInfo feature) {
    timedFeatures << feature.name
  }

  void visitSpec(SpecInfo spec) {
    spec.addListener(new TimingRunListener(timeSpec, timedFeatures))
  }
}