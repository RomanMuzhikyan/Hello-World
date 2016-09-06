package bin;

public enum MusicType {
	Mp3(1),
    Mp4(2);

	private int ID;
	
	MusicType(Integer ID)
    {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
}
