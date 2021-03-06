/*
 * Copyright 2019 Arcus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iris.core.dao;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.iris.messages.type.PersonAccessDescriptor;
import com.iris.messages.type.PlaceAccessDescriptor;

public interface PersonPlaceAssocDAO {

   List<PlaceAccessDescriptor> listPlaceAccessForPerson(UUID personId);
   List<PersonAccessDescriptor> listPersonAccessForPlace(UUID placeId);
   Set<UUID> findPersonIdsByPlace(UUID placeId);
   Set<UUID> findPlaceIdsByPerson(UUID personId);

}

