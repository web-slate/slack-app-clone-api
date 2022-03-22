package com.slack.slackcloneapi.repository;

import com.slack.slackcloneapi.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {
}
