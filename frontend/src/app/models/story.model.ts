export interface Character {
  id: string;
  name: string;
  role: string;
  description: string;
  imagePath: string | null;
  isSuspect: boolean;
}

export interface Chapter {
  order: number;
  title: string;
  narrative: string;
  involvedCharacterIds: string[];
}

export interface Story {
  id: string;
  title: string;
  description: string;
  difficulty: string;
  characters: Character[];
  chapters: Chapter[];
}
