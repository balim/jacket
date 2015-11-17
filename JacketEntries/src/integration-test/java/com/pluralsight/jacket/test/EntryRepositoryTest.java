package com.pluralsight.jacket.test;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pluralsight.jacket.entry.data.models.Entry;
import com.pluralsight.jacket.entry.repository.EntryRepository;
import com.pluralsight.repository.AbstractTest;

public class EntryRepositoryTest extends AbstractTest {

		@Autowired EntryRepository repository;

		/**
		 * @since Step 2.1
		 */
		@Test
		public void findEntryById() {

			Entry entry = repository.findOne(1L);
			
			assertThat(entry, is(notNullValue()));

		}
}
