package com.userservice;


import com.microsoft.azure.spring.data.cosmosdb.config.AbstractDocumentDbConfiguration;
import com.microsoft.azure.spring.data.cosmosdb.config.DocumentDBConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "azure.documentdb")
public class DatabaseConfigurations extends AbstractDocumentDbConfiguration {

  private String uri;
  private String key;
  private String database;

  public DocumentDBConfig getConfig(){
    return DocumentDBConfig.builder(uri,key,database).build();
  }
}
