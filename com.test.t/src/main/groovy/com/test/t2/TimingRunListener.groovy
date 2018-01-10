package com.test.t2

import org.spockframework.runtime.AbstractRunListener
import org.spockframework.runtime.model.SpecInfo
import org.spockframework.runtime.model.FeatureInfo
import org.spockframework.runtime.model.MethodInfo


class TimingRunListener extends AbstractRunListener {

	def timeSpec = false
	def specStartTime
	def featureStartTimes = [:]

	TimingRunListener(timeSpec, timedFeatures, timedFixtures) {
		this.timeSpec = timeSpec
		timedFeatures.each { featureTimes[it] = null }
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