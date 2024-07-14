package app.api.playstore_app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProfileEntity {

    private int profileId;
    private String fullName;
    private String eMail;
    private String dob;
    private long contact;
    private int appId;
}
