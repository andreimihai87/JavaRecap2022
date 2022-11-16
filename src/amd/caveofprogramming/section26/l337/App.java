package amd.caveofprogramming.section26.l337;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class App {

    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
        
        Receiver reciver = MidiSystem.getReceiver();
        
        ShortMessage message = new ShortMessage();
        message.setMessage(ShortMessage.NOTE_ON, 0, 60, 127);
        
        reciver.send(message, -1);
        
        Thread.sleep(3000);
        
    }

}
