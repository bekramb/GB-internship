package ru.geekbrains.rest.service;

import org.json.JSONObject;
import ru.geekbrains.rest.model.Person;
import ru.geekbrains.rest.model.Site;

import java.time.LocalDate;
import java.util.List;

public interface UserService {

    JSONObject getStats(int siteId);

    JSONObject statsByDate(int siteId, int personId, LocalDate start, LocalDate end);

    List<Person> getPersons();

    List<Site> getSites();
}
