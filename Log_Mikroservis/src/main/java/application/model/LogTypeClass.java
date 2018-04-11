package application.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/*  logTypeId  |    logTypeName
      1        |      Sign in
      2        |      Sign up
      3        |      Register
      4        |     Started trips
      5        |     Stopped trips   */
@Entity
@Table(name="log_type")
public class LogTypeClass implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String typeName;

  //  @OneToOne(fetch = FetchType.EAGER, mappedBy = "logType")
    //private LogClass logClass;

    public LogTypeClass() {    }

    public LogTypeClass(@NotNull String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return String.format(
                "LogType[id=%d, typeName='%s']",
                id,typeName);
    }

    public Long getId() {        return id;  }

    public String getTypeName() {       return typeName; }

    public void setTypeName(String typeName) {        this.typeName = typeName; }
}
