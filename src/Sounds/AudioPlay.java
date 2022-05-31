package Sounds;

import java.io.File;
import java.io.FileNotFoundException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioPlay {
	
	public AudioPlay(String soundName)
	{
		try
		{
			File soundFile = new File("src/Sounds/"+soundName);
			if (! soundFile.exists() ) 
			  throw new FileNotFoundException("Did not find: " + soundName);
			PlaySound(soundFile);
		}
		catch(FileNotFoundException ex)
		{
			ex.getMessage();
		}
	}
	
	private void PlaySound(File sound)
	{
		try
		{
		      Clip clip = AudioSystem.getClip();
		      clip.open(AudioSystem.getAudioInputStream(sound));
		      clip.start();
		}
		catch(Exception e)
	    {
			e.getMessage();
	    }
	}

}
