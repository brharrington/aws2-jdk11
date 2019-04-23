package example;

import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

public class Main {

  public static void main(String[] args) throws Exception {
    System.out.println(System.getProperty("java.version"));
    S3Client client = S3Client.builder()
        .credentialsProvider(DefaultCredentialsProvider.create())
        .region(Region.US_EAST_1)
        .build();
    try (client) {
      client.listBuckets().buckets().forEach(System.out::println);
    }
  }
}
