package au.com.vbuirski.notification.domain;


/**
 * @author vonita
 */
@Getter
@Setter
public abstract class NotificationTemplate {

  @Id
  protected String id;

  @Indexed
  protected TemplateStatus status = TemplateStatus.ACTIVE;

  protected String name;
  protected Provenance created;
  protected Provenance lastUpdated;

  @Setter(AccessLevel.NONE)
  private final TemplateType templateType;

  public NotificationTemplate(TemplateType templateType, String id, String name, Provenance created,
                              Provenance lastUpdated) {

    this.templateType = templateType;
    this.id = id;
    this.name = name;
    this.created = created;
    this.lastUpdated = lastUpdated;
  }
}
