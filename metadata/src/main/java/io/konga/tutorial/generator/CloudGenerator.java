package io.konga.tutorial.generator;

import java.io.FileWriter;

import io.konga.metadata.definition.KongaDefinition;
import io.konga.metadata.definition.KongaMetadata;
import io.konga.metadata.generator.KongaGenerator;

public class CloudGenerator {

	public CloudGenerator() throws Exception {
		KongaDefinition definition = new KongaDefinition("Konga Tutorial Basics", 
				"io.konga.tutorial.model");
		
		KongaMetadata metadata = KongaGenerator.readPackage(definition);
		
		System.out.println("parsing");
		
		String metadataJson = metadata.toJson();
		
		FileWriter fw = new FileWriter("../metadata.json");
		fw.write(metadataJson);
		fw.close();
		
		System.out.println("ready");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new CloudGenerator();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
