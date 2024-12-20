package com.example.ems;

//Make sure to add com.assemblyai:assemblyai-java to your dependencies

//Make sure to add com.assemblyai:assemblyai-java to your dependencies

//Make sure to add com.assemblyai:assemblyai-java to your dependencies

import com.assemblyai.api.AssemblyAI;
import com.assemblyai.api.resources.transcripts.requests.TranscriptParams;
import com.assemblyai.api.resources.transcripts.types.TranscriptStatus;

import java.io.File;

public final class App {

 public static void main(String... args) throws Exception {
     var apiKey = "3629cac3ade3427d988d841499b91edd";
//     var fileUrl = "https://assembly.ai/wildfires.mp3";


     var client = AssemblyAI.builder()
             .apiKey(apiKey)
             .build();

     // If you want to upload a local file instead of using a URL:
//      var filePath = "C:/Users/papnn/Desktop/JAVA CODE/New folder/JavaCode/harvard.wav";
//      var uploadedFile = client.files().upload(new File(filePath));
//      fileUrl = uploadedFile.getUploadUrl();

     var filePath = "C:/Users/papnn/Desktop/JAVA CODE/New folder/JavaCode/harvard.wav";

     var uploadedFile = client.files().upload(new File(filePath));

     var fileUrl = uploadedFile.getUploadUrl();


     var transcriptParams = TranscriptParams.builder()
             .audioUrl(fileUrl)
             .build();


     var transcript = client.transcripts().transcribe(transcriptParams);

     if (transcript.getStatus() == TranscriptStatus.ERROR) {
         throw new Exception("Transcript failed with error: " + transcript.getError().orElse("Unknown error"));
     }

     System.out.println(transcript);
 }
}
