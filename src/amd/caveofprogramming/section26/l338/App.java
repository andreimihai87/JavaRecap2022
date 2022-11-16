package amd.caveofprogramming.section26.l338;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class App {

    public static void main(String[] args)
            throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {

        Receiver receiver = MidiSystem.getReceiver();
        
        int[] notes = { 60, 64, 67, 60, 65, 67, 55, 59, 62, 55, 60, 62, 53, 57, 60, 53, 58, 60 };
        int[] times = {0, 0, 0, 1000, 1000, 1000, 2000, 2000, 2000, 3000, 3000, 3000, 4000, 4000, 4000, 5000, 5000, 5000};
        
        for(int i = 0; i < notes.length; i+=3) {
            
            int note1 = notes[i];
            int note2 = notes[i];
            int note3 = notes[i];
            int time = times[i];
            
            receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note1, 127), time * 1000);
            receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note2, 127), time * 1000);
            receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note3, 127), time * 1000);
            //because the NOTE_OFF is instant, I will use a sleep() until I find why
            Thread.sleep(1000);
            receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, note1, 127), (time + 1000) * 1000);
            receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, note2, 127), (time + 1000) * 1000);
            receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, note3, 127), (time + 1000) * 1000);
            
        }
        
        Thread.sleep(3000);

    }

}
