package com.example;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.*;
import io.javaoperatorsdk.operator.api.Context;
import io.javaoperatorsdk.operator.processing.event.EventSourceManager;

@Controller
public class MemcachedController implements ResourceController<Memcached> {

    private final KubernetesClient client;

    public MemcachedController(KubernetesClient client) {
        this.client = client;
    }

    // TODO Fill in the rest of the controller

    @Override
    public void init(EventSourceManager eventSourceManager) {
        // TODO: fill in init
    }

    @Override
    public UpdateControl<Memcached> createOrUpdateResource(
        Memcached resource, Context<Memcached> context) {
        // TODO: fill in logic

        return UpdateControl.noUpdate();
    }
}

