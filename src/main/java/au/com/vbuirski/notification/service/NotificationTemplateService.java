package au.com.vbuirski.notification.service;

import java.util.List;

/**
 * @author vonita
 */
public interface NotificationTemplateService <T extends NotificationTemplate> {

  T createTemplate(T notificationTemplate);

  T getTemplate(String templateId);

  List<T> getTemplates();

  T updateTemplate(String id, T notificationTemplate);

}
