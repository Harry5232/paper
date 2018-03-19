package com.test.t3

import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension
import org.spockframework.runtime.model.SpecInfo
import org.spockframework.runtime.model.FeatureInfo
import org.spockframework.runtime.model.MethodInfo
import com.athaydes.spockframework.report.internal.FeatureRun

class ScoresExtension extends AbstractAnnotationDrivenExtension<Scores> {
	def ScoresSpec = false
	static FeatureScores = []
	def sumScores = 0

	void visitSpecAnnotation(Scores annotation, SpecInfo spec) {
		ScoresSpec = true
	}

	void visitFeatureAnnotation(Scores annotation, FeatureInfo feature) {

		float grade = annotation.points() 
		FeatureScores << grade
		println grade
		println "***********"
		
	}

	void visitSpec(SpecInfo spec) {
		//spec.addListener(new ScoresRunListener(ScoresSpec, ScoresFeatures))


	}
}