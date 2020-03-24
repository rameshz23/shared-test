#!/usr/bin/env groovy

#def call(body) {
#    def config = [:]
#    body.resolveStrategy = Closure.DELEGATE_FIRST
#    body.delegate = config
#    body()
#
#    node {
#        echo "config=${config}"
#    }
#}


def call(Map pipelineParams) {
    // evaluate the body block, and collect configuration into the object
    def pipelineParams= [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

pipeline {

	agent ('agent-jnlp')
		stages {
		stage ('sample'){
			 sh 'echo "coming"'
				}
			}
	}
}
