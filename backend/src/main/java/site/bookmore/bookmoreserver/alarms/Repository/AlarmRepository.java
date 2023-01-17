package site.bookmore.bookmoreserver.alarms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.bookmore.bookmoreserver.alarms.entity.Alarm;

public interface AlarmRepository extends JpaRepository<Alarm, Long> {

}
