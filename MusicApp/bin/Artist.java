package bin;

public class Artist {
	private Integer artistID;
    private String name;
    public Artist(Integer ID, String name)
    {
        this.name = name;
        this.artistID = ID;
    }
    
    public Artist(String name) //ete artisti anuny ka kci papki mej
    {
       
    }
   
    public Integer getArtistID() {
		return artistID;
	}
    public void setArtistID(Integer artistID) {
		this.artistID = artistID;
	}
    
   
    public String getName() {
		return name;
	}
}
