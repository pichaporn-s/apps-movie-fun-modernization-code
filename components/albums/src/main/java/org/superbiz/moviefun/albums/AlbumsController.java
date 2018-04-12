package org.superbiz.moviefun.albums;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumsController {

    private final AlbumsRepository albumsRepository;

    public AlbumsController(AlbumsRepository repository) {
        this.albumsRepository = repository;
    }


    @GetMapping
    public List<Album> index() {
        return albumsRepository.getAlbums();

    }

    @GetMapping("/{id}")
    public Album find(@PathVariable Long id) {
        return albumsRepository.find(id);
    }

    @PostMapping
    public void addAlbum(@RequestBody Album album) {
        albumsRepository.addAlbum(album);
    }

}
