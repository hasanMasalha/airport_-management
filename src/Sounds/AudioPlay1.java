package Sounds;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlay1 {
    Long currentFrame;
    Clip clip;
     
    // current status of clip
    String status;
     
    AudioInputStream audioInputStream;
    static String filePath="c.wav";
 
    public AudioPlay1()throws UnsupportedAudioFileException,IOException, LineUnavailableException 
    {
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
         
        clip = AudioSystem.getClip();
         
        clip.open(audioInputStream);
         
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        clip.stop();
    }
     public void play() 
    {
        clip.start();
         
    }
     
    public void pause() 
    {
        clip.setMicrosecondPosition(0);
        clip.stop();
    }

}
