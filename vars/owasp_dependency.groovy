def call(){
  dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP' --disableNodeJS
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
