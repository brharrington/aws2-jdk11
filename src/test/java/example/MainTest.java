package example;

import org.junit.Test;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import static org.junit.Assert.*;

public class MainTest {
  @Test
  public void builderWorks() {
    assertTrue(System.getProperty("java.version").startsWith("11."));
    S3Client client = S3Client.builder().region(Region.US_EAST_1).build();
    assertNotNull(client);
  }
}
