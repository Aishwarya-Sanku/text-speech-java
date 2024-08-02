package com.testing.ai;

import java.util.Locale;
import java.util.Scanner;
import javax.speech.Central;

import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;


public class TextToSpeech {
	
	private static final String VOICES_KEY="freetts.voice";
	private static final String VOICES_VALUE="com.sun.speech.freetts.en.us.cum_us_kal.KevinVoiceDirectory";
	private static final String CENTRAL_DATA="com.sun.speech.freetts.jsapi.FreeTTSEngineCentral";
	public static void main(String[] args) {
	try {	// TODO Auto-generated method stub
 Scanner s= new Scanner(System.in);
 
 String data= s.nextLine();
 
 
 System.setProperty(VOICES_KEY, VOICES_VALUE);
 
 
 Central.registerEngineCentral(CENTRAL_DATA);
 
 Synthesizer sy= Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
 sy.allocate();
 sy.resume();
 sy.speakPlainText(data, null);
 
 sy.waitEngineState(Synthesizer.QUEUE_EMPTY);
	sy.deallocate();
	}
	catch(Exception e) {
		 e.printStackTrace();
		
		
	}

}
}
