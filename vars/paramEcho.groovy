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
import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import groovy.io.FileType
import groovy.json.JsonSlurper

pipeline {

	stages {
		stage ('sample'){
			 sh 'echo "coming"'
				}
			}
	}

