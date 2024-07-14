package app.api.playstore_app;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AppEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appId;
    private String appName;
    private String appVendor;
    private int downloadCount;
    private float ratings;
    transient private List<ProfileEntity> users;

    public List<ProfileEntity> getUsers() {
        return users;
    }

    public void setUsers(List<ProfileEntity> users) {
        this.users = users;
    }

}
