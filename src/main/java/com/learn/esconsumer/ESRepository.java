package com.learn.esconsumer;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ESRepository extends ElasticsearchRepository<UserDoc, String> {

}
