package org.superbiz.moviefun.albumsapi;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;
import java.util.List;
import static org.springframework.http.HttpMethod.GET;

public class AlbumsClient {

    private String albumsUrl;
    private RestOperations restOperations;

    public AlbumsClient(String albumsUrl, RestOperations restOperations) {
        this.albumsUrl = albumsUrl;
        this.restOperations = restOperations;
    }

    public void addAlbum(AlbumsInfo album) {
        restOperations.postForEntity(albumsUrl, album, AlbumsInfo.class);
    }

    public AlbumsInfo find(long id) {
        return restOperations.getForEntity(albumsUrl + "/" + id, AlbumsInfo.class).getBody();
    }

    public List<AlbumsInfo> getAlbums() {
        ParameterizedTypeReference<List<AlbumsInfo>> albumListType = new ParameterizedTypeReference<List<AlbumsInfo>>() {
        };

        return restOperations.exchange(albumsUrl, GET, null, albumListType).getBody();
    }
}
