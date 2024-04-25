/*
 * refactor the AlertService and MapAlertDAO classes:
 * Create a new package-private interface, named AlertDAO, that contains the same methods as MapAlertDAO.
 * MapAlertDAO should implement the ALertDAO interface.
 * AlertService should have a public constructor that accepts AlertDAO.
 * The raiseAlert and getAlertTime methods should use the object passed through the constructor
 * 
 * Tests:
 * MapAlertDAO implements AlertDAO interface: Correct answer
 * AlertService accepts AlertDAO in its constructor: Correct answer
 * The raiseAlert and getAlertTime methods use AlertDAO passed through constructor: Correct answer 

 */

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class AlertService {
  private final AlertDAO storage; // added

  public AlertService(AlertDAO alertDAO) { // added
    this.storage = alertDAO; // added
  };

  public UUID raiseAlert() {
    return this.storage.addAlert(new Date());
  }

  public Date getAlertTime(UUID id) {
    return this.storage.getAlert(id);
  }
}

interface AlertDAO { // added
  public UUID addAlert(Date time); // added

  public Date getAlert(UUID id); // added
}

class MapAlertDAO implements AlertDAO {
  private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

  public UUID addAlert(Date time) {
    UUID id = UUID.randomUUID();
    this.alerts.put(id, time);
    return id;
  }

  public Date getAlert(UUID id) {
    return this.alerts.get(id);
  }
}