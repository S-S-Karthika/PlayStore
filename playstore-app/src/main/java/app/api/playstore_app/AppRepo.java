package app.api.playstore_app;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepo extends JpaRepository <AppEntity,Integer> {
}
