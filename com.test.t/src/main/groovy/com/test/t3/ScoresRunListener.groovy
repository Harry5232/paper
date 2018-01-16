package com.test.t3

import org.spockframework.runtime.AbstractRunListener
import org.spockframework.runtime.model.SpecInfo
import org.spockframework.runtime.model.FeatureInfo
import org.spockframework.runtime.model.MethodInfo


class ScoresRunListener extends AbstractRunListener {

	def GradeSpec = false
	def specStartTime
	def featureStartTimes = [:]

	ScoresRunListener(timeSpec, timedFeatures) {
		this.GradeSpec = GradeSpec
		//GradeFeatures.each { featureStartTimes[it] = null }
	}

	private now() {
		System.currentTimeMillis()
	}

	private start(name) {
		println "starting $name …"
	}

	private done(name, started, finished = now()) {
		println "$name took ${finished - started} milliseconds"
	}

	void beforeSpec(SpecInfo spec) {
		if (timeSpec) {
			specStartTime = now()
			start("spec '$spec.name'")
		}
	}

	void beforeFeature(FeatureInfo feature) {
		if (featureStartTimes.containsKey(feature.name)) {
			featureStartTimes[feature.name] = now()
			start("feature '$feature.name'")
		}
	}

	void afterFeature(FeatureInfo feature) {
		def startedAt = featureStartTimes[feature.name]
		if (startedAt) {
			echo("feature '$feature.name'", startedAt)
		}
	}

	void afterSpec(SpecInfo spec) {
		if (specStartTime) {
			echo("spec '$spec.name'", specStartTime)
		}
	}
}