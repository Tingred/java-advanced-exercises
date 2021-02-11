package enums;

public enum Note {
    C(100), Cis(120), D(130), Dis(140), E(150), F(160), Fis(170), G(180), Gis(190), A(200), Ais(210), H(220);

    private final double frequency;

    Note(double fequency) {
        this.frequency = fequency;
    }

    public double getFrequency(Octave octave) {
        return frequency * (octave.ordinal()+1);
    }
}
