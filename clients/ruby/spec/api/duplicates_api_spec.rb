require 'spec_helper'
require 'json'

describe 'DuplicatesApi' do
  before do
    @api_instance = FeverClient::DuplicatesApi.new
  end

  after do
  end

  describe 'test an instance of DuplicatesApi' do
    it 'should create an instance of DuplicatesApi' do
      expect(@api_instance).to be_instance_of(FeverClient::DuplicatesApi)
    end
  end

  describe 'find_duplicates test' do
    it 'should work' do
    end
  end

  describe 'suggested_dedup_threshold test' do
    it 'should work' do
    end
  end

end
