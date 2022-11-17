package amd.caveofprogramming.section26.l339;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class App {

    public static void main(String[] args)
            throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {

        Map<Integer, List<Integer>> mapNotes = new LinkedHashMap<Integer, List<Integer>>();

        mapNotes.put(0, List.of(60, 64, 67));
        mapNotes.put(1000, List.of(60, 65, 67));
        mapNotes.put(2000, List.of(55, 59, 62));
        mapNotes.put(3000, List.of(55, 60, 62));
        mapNotes.put(4000, List.of(53, 57, 60));
        mapNotes.put(5000, List.of(53, 58, 60));

        try (Sequencer sequencer = MidiSystem.getSequencer()) {
            sequencer.open();
            Sequence sequence = new Sequence(Sequence.PPQ, 1);
            Track track = sequence.createTrack();

            for (Entry<Integer, List<Integer>> entry : mapNotes.entrySet()) {
                int time = entry.getKey();
                for (int note : entry.getValue()) {
                    // @formatter:off
                    track.add(new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 80), (time + 1000) / 1000));
                    track.add(new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 0, note, 80), (time + 3000) / 1000));
                    // @formatter:on
                }
            }
            sequencer.setSequence(sequence);

            sequencer.start();
            Thread.sleep(7000);
            sequencer.stop();
        }
    }
}
