package au.com.vbuirski.notification.service;

import java.util.List;

import au.com.vbuirski.notification.domain.NotificationTemplate;

/**
 * @author vb
 */
public interface NotificationTemplateService <T extends NotificationTemplate> {

  T createTemplate(T notificationTemplate);

  T getTemplate(String templateId);

  List<T> getTemplates();

  T updateTemplate(String id, T notificationTemplate);

}
