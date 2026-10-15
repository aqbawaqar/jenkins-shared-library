def call(String pipelineStage, String errorMessage) {
    echo "Sending failure email notification for stage: ${pipelineStage}"
    emailext (
        to: 'admin@example.com',
        subject: "Pipeline Failure Alert: ${pipelineStage}",
        body: "Hello,\n\nThe pipeline failed at stage: ${pipelineStage}.\nError Details: ${errorMessage}\n\nPlease check Jenkins logs."
    )
}