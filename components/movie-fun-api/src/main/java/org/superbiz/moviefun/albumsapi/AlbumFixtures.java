package org.superbiz.moviefun.albumsapi;

import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class AlbumFixtures {

    public List<AlbumsInfo> load() {
        return asList(
            new AlbumsInfo("Massive Attack", "Mezzanine", 1998, 9),
            new AlbumsInfo("Radiohead", "OK Computer", 1997, 8),
            new AlbumsInfo("Radiohead", "Kid A", 2000, 9)
        );
    }
}
