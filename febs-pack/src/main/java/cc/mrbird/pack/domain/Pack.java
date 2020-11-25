package cc.mrbird.pack.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_pack")
public class Pack {
    @Id
    @Column(name = "PACK_ID")
    private Long packId;

    @Column(name = "URL")
    private String url;

    @Column(name = "STATE")
    private String state;

    /**
     * @return PACK_ID
     */
    public Long getPackId() {
        return packId;
    }

    /**
     * @param packId
     */
    public void setPackId(Long packId) {
        this.packId = packId;
    }

    /**
     * @return URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "Pack{" +
                "packId=" + packId +
                ", url='" + url + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}