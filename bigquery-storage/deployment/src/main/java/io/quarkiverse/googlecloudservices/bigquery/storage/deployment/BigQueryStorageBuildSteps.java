package io.quarkiverse.googlecloudservices.bigquery.storage.deployment;

import io.quarkiverse.googlecloudservices.bigquery.storage.runtime.BigQueryStorageProducer;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

public class BigQueryStorageBuildSteps {

    private static final String FEATURE = "google-cloud-bigquery-storage";

    @BuildStep
    public FeatureBuildItem feature() { return new FeatureBuildItem(FEATURE); }

    @BuildStep
    public AdditionalBeanBuildItem producer() { return new AdditionalBeanBuildItem(BigQueryStorageProducer.class); }


}