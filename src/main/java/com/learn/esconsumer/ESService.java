package com.learn.esconsumer;

import org.springframework.stereotype.Service;

@Service
public class ESService {
    private final ESRepository repository;
    private final KafkaToEsMapper mapper;

    public ESService(ESRepository repository, KafkaToEsMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public void saveDataOnEs(User user){
        UserDoc doc= mapper.UserToUserDoc(user);
        repository.save(doc);
    }
}
