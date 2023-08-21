package com.dioclass.s3withspring;

import com.amazonaws.services.s3.model.Bucket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static com.dioclass.s3withspring.BucketServices.*;

@SpringBootApplication
public class S3withspringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(S3withspringApplication.class, args);

		//Listar os buckets
		//listOfBuckets();

		//Informaçoes sobre o Bucket
		//String bucket_name = "bucket-curso-s3-console"; //name of bucket
		//Bucket b = getBucket(bucket_name);
		//System.out.println("Info about the bucket: " + b.toString());

		//Criação de um Bucket
		String bucket_name = "second-bucket-curso-s3";
		Bucket b = createBucket(bucket_name);
		if (b != null)
			System.out.println(b.toString());
	}
}
