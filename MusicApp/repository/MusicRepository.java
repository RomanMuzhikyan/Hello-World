package repository;

import bin.Music;
import exceptions.InvalidCommandException;

public interface MusicRepository {
	Music getMusic(String musicName) throws InvalidCommandException;
	void deleteUser(Music music) throws InvalidCommandException;
	Music addMusic(Music music);
}
