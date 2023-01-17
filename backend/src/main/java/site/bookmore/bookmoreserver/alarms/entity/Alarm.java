package site.bookmore.bookmoreserver.alarms.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Alarms")
@EntityListeners(AuditingEntityListener.class)
public class Alarm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;
    @Column(name = "target_user", nullable = false)
    private Long targetUser;
    @Column(name = "from_user", nullable = false)
    private Long fromUser;
    @Column(name = "source_id", nullable = false)
    private Long source;
    @Column(nullable = false)
    private boolean confirmed;


    @CreatedDate
    @Column(name = "created_datetime")
    private LocalDateTime createdDatetime;


}
