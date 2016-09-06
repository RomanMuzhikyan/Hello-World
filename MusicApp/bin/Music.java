package bin;


import java.util.ArrayList;

public class Music {
private Integer Id;
private String musicName;
private  ArrayList <MusicType> musicType;

public Music(){};

public Music (String number)
{
    //sa ete Mp4 Mp3 arandznacni
}

public Music(Integer Id,String musicName) {
    this.musicName = musicName;
    setId(Id);
    musicType = new ArrayList<>();
}
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getMusicName() {
	return musicName;
}
public void setMusicName(String musicName) {
	this.musicName = musicName;
}

public ArrayList<MusicType> getMusicType() {
	return musicType;
}
public void addMusic(Music music) 
{
    
}
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Music music = (Music) o;
    return musicName != null ? musicName.equals(music.musicName) : music.musicName == null;
}
public void deleteMusic(Music music)
{

}
@Override
public int hashCode() {
    int result = musicName != null ? musicName.hashCode() : 0;
    return result;
}
}
